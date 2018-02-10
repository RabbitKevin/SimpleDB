package simpledb;

/**
 * Knows how to compute some aggregate over a set of IntFields.
 */
public class IntegerAggregator implements Aggregator {

    private static final long serialVersionUID = 1L;

    private int gbfield;
    private Type gbfieldtype;
    private int afield;
    private Op what;

    private List<Tuple> aggregateTuples;

    /**
     * Aggregate constructor
     * 
     * @param gbfield
     *            the 0-based index of the group-by field in the tuple, or
     *            NO_GROUPING if there is no grouping
     * @param gbfieldtype
     *            the type of the group by field (e.g., Type.INT_TYPE), or null
     *            if there is no grouping
     * @param afield
     *            the 0-based index of the aggregate field in the tuple
     * @param what
     *            the aggregation operator
     */

    public IntegerAggregator(int gbfield, Type gbfieldtype, int afield, Op what) {
        // some code goes here
        this.gbfield         = gbfield;
        this.gbfieldtype     = gbfieldtype;
        this.afield          = afield;
        this.what            = what;
        this.aggregateTuples = new ArrayList<Tuple>():
    }

    /**
     * Merge a new tuple into the aggregate, grouping as indicated in the
     * constructor
     * 
     * @param tup
     *            the Tuple containing an aggregate field and a group-by field
     */
    public void mergeTupleIntoGroup(Tuple tup) {
        // some code goes here
        TupleDesc td = tup.getTupleDesc();
        Type[]   t = new Type[2] {td.getFieldType(gbfield), td.getFiledType(afield)};
        String[] s = new String[2] {td.getFieldName(gbfield), td.getFieldName(afield)};
        TupleDesc atd = new TupleDesc(t, s);
        Field gf = tup.getField(gbfield);
        Field af = tup.getField(afield);
        // if the aggregator tuples contains the tuple
        // merge
        if (aggregateTuples.contains(gf)) {
        }
        else {
            aggregatorTuples.add();
        }
    }

    /**
     * Create a OpIterator over group aggregate results.
     * 
     * @return a OpIterator whose tuples are the pair (groupVal, aggregateVal)
     *         if using group, or a single (aggregateVal) if no grouping. The
     *         aggregateVal is determined by the type of aggregate specified in
     *         the constructor.
     */
    public OpIterator iterator() {
        // some code goes here
        //throw new
        //UnsupportedOperationException("please implement me for lab2");
        return new TupleIteragor(aggregateTuples.getTupleDesc(), agregateTuples.iterator());
    }

}
