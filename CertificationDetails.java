// ORM class for table 'CertificationDetails'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Nov 25 03:09:13 IST 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CertificationDetails extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("CertficationType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CertificationDetails.this.CertficationType = (String)value;
      }
    });
    setters.put("CertificationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CertificationDetails.this.CertificationCode = (String)value;
      }
    });
    setters.put("CertificationOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CertificationDetails.this.CertificationOwner = (String)value;
      }
    });
    setters.put("Certificationtitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CertificationDetails.this.Certificationtitle = (String)value;
      }
    });
    setters.put("CompetencyDimension", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CertificationDetails.this.CompetencyDimension = (String)value;
      }
    });
    setters.put("ComplexityLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CertificationDetails.this.ComplexityLevel = (String)value;
      }
    });
  }
  public CertificationDetails() {
    init0();
  }
  private String CertficationType;
  public String get_CertficationType() {
    return CertficationType;
  }
  public void set_CertficationType(String CertficationType) {
    this.CertficationType = CertficationType;
  }
  public CertificationDetails with_CertficationType(String CertficationType) {
    this.CertficationType = CertficationType;
    return this;
  }
  private String CertificationCode;
  public String get_CertificationCode() {
    return CertificationCode;
  }
  public void set_CertificationCode(String CertificationCode) {
    this.CertificationCode = CertificationCode;
  }
  public CertificationDetails with_CertificationCode(String CertificationCode) {
    this.CertificationCode = CertificationCode;
    return this;
  }
  private String CertificationOwner;
  public String get_CertificationOwner() {
    return CertificationOwner;
  }
  public void set_CertificationOwner(String CertificationOwner) {
    this.CertificationOwner = CertificationOwner;
  }
  public CertificationDetails with_CertificationOwner(String CertificationOwner) {
    this.CertificationOwner = CertificationOwner;
    return this;
  }
  private String Certificationtitle;
  public String get_Certificationtitle() {
    return Certificationtitle;
  }
  public void set_Certificationtitle(String Certificationtitle) {
    this.Certificationtitle = Certificationtitle;
  }
  public CertificationDetails with_Certificationtitle(String Certificationtitle) {
    this.Certificationtitle = Certificationtitle;
    return this;
  }
  private String CompetencyDimension;
  public String get_CompetencyDimension() {
    return CompetencyDimension;
  }
  public void set_CompetencyDimension(String CompetencyDimension) {
    this.CompetencyDimension = CompetencyDimension;
  }
  public CertificationDetails with_CompetencyDimension(String CompetencyDimension) {
    this.CompetencyDimension = CompetencyDimension;
    return this;
  }
  private String ComplexityLevel;
  public String get_ComplexityLevel() {
    return ComplexityLevel;
  }
  public void set_ComplexityLevel(String ComplexityLevel) {
    this.ComplexityLevel = ComplexityLevel;
  }
  public CertificationDetails with_ComplexityLevel(String ComplexityLevel) {
    this.ComplexityLevel = ComplexityLevel;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CertificationDetails)) {
      return false;
    }
    CertificationDetails that = (CertificationDetails) o;
    boolean equal = true;
    equal = equal && (this.CertficationType == null ? that.CertficationType == null : this.CertficationType.equals(that.CertficationType));
    equal = equal && (this.CertificationCode == null ? that.CertificationCode == null : this.CertificationCode.equals(that.CertificationCode));
    equal = equal && (this.CertificationOwner == null ? that.CertificationOwner == null : this.CertificationOwner.equals(that.CertificationOwner));
    equal = equal && (this.Certificationtitle == null ? that.Certificationtitle == null : this.Certificationtitle.equals(that.Certificationtitle));
    equal = equal && (this.CompetencyDimension == null ? that.CompetencyDimension == null : this.CompetencyDimension.equals(that.CompetencyDimension));
    equal = equal && (this.ComplexityLevel == null ? that.ComplexityLevel == null : this.ComplexityLevel.equals(that.ComplexityLevel));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CertificationDetails)) {
      return false;
    }
    CertificationDetails that = (CertificationDetails) o;
    boolean equal = true;
    equal = equal && (this.CertficationType == null ? that.CertficationType == null : this.CertficationType.equals(that.CertficationType));
    equal = equal && (this.CertificationCode == null ? that.CertificationCode == null : this.CertificationCode.equals(that.CertificationCode));
    equal = equal && (this.CertificationOwner == null ? that.CertificationOwner == null : this.CertificationOwner.equals(that.CertificationOwner));
    equal = equal && (this.Certificationtitle == null ? that.Certificationtitle == null : this.Certificationtitle.equals(that.Certificationtitle));
    equal = equal && (this.CompetencyDimension == null ? that.CompetencyDimension == null : this.CompetencyDimension.equals(that.CompetencyDimension));
    equal = equal && (this.ComplexityLevel == null ? that.ComplexityLevel == null : this.ComplexityLevel.equals(that.ComplexityLevel));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CertficationType = JdbcWritableBridge.readString(1, __dbResults);
    this.CertificationCode = JdbcWritableBridge.readString(2, __dbResults);
    this.CertificationOwner = JdbcWritableBridge.readString(3, __dbResults);
    this.Certificationtitle = JdbcWritableBridge.readString(4, __dbResults);
    this.CompetencyDimension = JdbcWritableBridge.readString(5, __dbResults);
    this.ComplexityLevel = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CertficationType = JdbcWritableBridge.readString(1, __dbResults);
    this.CertificationCode = JdbcWritableBridge.readString(2, __dbResults);
    this.CertificationOwner = JdbcWritableBridge.readString(3, __dbResults);
    this.Certificationtitle = JdbcWritableBridge.readString(4, __dbResults);
    this.CompetencyDimension = JdbcWritableBridge.readString(5, __dbResults);
    this.ComplexityLevel = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CertficationType, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationOwner, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Certificationtitle, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CompetencyDimension, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ComplexityLevel, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CertficationType, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationCode, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationOwner, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Certificationtitle, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CompetencyDimension, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ComplexityLevel, 6 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CertficationType = null;
    } else {
    this.CertficationType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CertificationCode = null;
    } else {
    this.CertificationCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CertificationOwner = null;
    } else {
    this.CertificationOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Certificationtitle = null;
    } else {
    this.Certificationtitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CompetencyDimension = null;
    } else {
    this.CompetencyDimension = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ComplexityLevel = null;
    } else {
    this.ComplexityLevel = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CertficationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertficationType);
    }
    if (null == this.CertificationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationCode);
    }
    if (null == this.CertificationOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationOwner);
    }
    if (null == this.Certificationtitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Certificationtitle);
    }
    if (null == this.CompetencyDimension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CompetencyDimension);
    }
    if (null == this.ComplexityLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ComplexityLevel);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CertficationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertficationType);
    }
    if (null == this.CertificationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationCode);
    }
    if (null == this.CertificationOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationOwner);
    }
    if (null == this.Certificationtitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Certificationtitle);
    }
    if (null == this.CompetencyDimension) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CompetencyDimension);
    }
    if (null == this.ComplexityLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ComplexityLevel);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(CertficationType==null?"null":CertficationType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationCode==null?"null":CertificationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationOwner==null?"null":CertificationOwner, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Certificationtitle==null?"null":Certificationtitle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CompetencyDimension==null?"null":CompetencyDimension, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ComplexityLevel==null?"null":ComplexityLevel, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CertficationType==null?"null":CertficationType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationCode==null?"null":CertificationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationOwner==null?"null":CertificationOwner, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Certificationtitle==null?"null":Certificationtitle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CompetencyDimension==null?"null":CompetencyDimension, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ComplexityLevel==null?"null":ComplexityLevel, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertficationType = null; } else {
      this.CertficationType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationCode = null; } else {
      this.CertificationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationOwner = null; } else {
      this.CertificationOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Certificationtitle = null; } else {
      this.Certificationtitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CompetencyDimension = null; } else {
      this.CompetencyDimension = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ComplexityLevel = null; } else {
      this.ComplexityLevel = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertficationType = null; } else {
      this.CertficationType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationCode = null; } else {
      this.CertificationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationOwner = null; } else {
      this.CertificationOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Certificationtitle = null; } else {
      this.Certificationtitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CompetencyDimension = null; } else {
      this.CompetencyDimension = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ComplexityLevel = null; } else {
      this.ComplexityLevel = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    CertificationDetails o = (CertificationDetails) super.clone();
    return o;
  }

  public void clone0(CertificationDetails o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CertficationType", this.CertficationType);
    __sqoop$field_map.put("CertificationCode", this.CertificationCode);
    __sqoop$field_map.put("CertificationOwner", this.CertificationOwner);
    __sqoop$field_map.put("Certificationtitle", this.Certificationtitle);
    __sqoop$field_map.put("CompetencyDimension", this.CompetencyDimension);
    __sqoop$field_map.put("ComplexityLevel", this.ComplexityLevel);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CertficationType", this.CertficationType);
    __sqoop$field_map.put("CertificationCode", this.CertificationCode);
    __sqoop$field_map.put("CertificationOwner", this.CertificationOwner);
    __sqoop$field_map.put("Certificationtitle", this.Certificationtitle);
    __sqoop$field_map.put("CompetencyDimension", this.CompetencyDimension);
    __sqoop$field_map.put("ComplexityLevel", this.ComplexityLevel);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
