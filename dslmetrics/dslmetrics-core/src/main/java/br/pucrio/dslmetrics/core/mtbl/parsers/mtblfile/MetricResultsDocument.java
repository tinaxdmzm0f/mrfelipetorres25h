/*
 * An XML document type.
 * Localname: MetricResults
 * Namespace: TogetherMtbl
 * Java type: br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument
 *
 * Automatically generated - do not modify.
 */
package br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile;


/**
 * A document containing one MetricResults(@TogetherMtbl) element.
 *
 * This is a complex type.
 */
public interface MetricResultsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetricResultsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s030C4636EDC6D9163E90E28F4FE3C275").resolveHandle("metricresults2ededoctype");
    
    /**
     * Gets the "MetricResults" element
     */
    br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsType getMetricResults();
    
    /**
     * Sets the "MetricResults" element
     */
    void setMetricResults(br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsType metricResults);
    
    /**
     * Appends and returns a new empty "MetricResults" element
     */
    br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsType addNewMetricResults();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument newInstance() {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.pucrio.dslmetrics.core.mtbl.parsers.mtblfile.MetricResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
