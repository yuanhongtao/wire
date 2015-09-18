// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/samebasename/single_level.proto at 20:1
package com.squareup.wire.protos.single_level;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;

public final class Bar extends Message<Bar> {
  public static final ProtoAdapter<Bar> ADAPTER = ProtoAdapter.newMessageAdapter(Bar.class);

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_BAZ = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer baz;

  public Bar(Integer baz) {
    this(baz, null);
  }

  public Bar(Integer baz, TagMap tagMap) {
    super(tagMap);
    this.baz = baz;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Bar)) return false;
    Bar o = (Bar) other;
    return equals(tagMap(), o.tagMap())
        && equals(baz, o.baz);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = tagMap() != null ? tagMap().hashCode() : 0;
      result = result * 37 + (baz != null ? baz.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Bar, Builder> {
    public Integer baz;

    public Builder() {
    }

    public Builder(Bar message) {
      super(message);
      if (message == null) return;
      this.baz = message.baz;
    }

    public Builder baz(Integer baz) {
      this.baz = baz;
      return this;
    }

    @Override
    public Bar build() {
      return new Bar(baz, buildTagMap());
    }
  }
}
