// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/child_pkg.proto at 22:1
package com.squareup.wire.protos;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import com.squareup.wire.protos.foreign.ForeignEnum;
import java.lang.Object;
import java.lang.Override;

public final class ChildPackage extends Message<ChildPackage> {
  public static final ProtoAdapter<ChildPackage> ADAPTER = ProtoAdapter.newMessageAdapter(ChildPackage.class);

  private static final long serialVersionUID = 0L;

  public static final ForeignEnum DEFAULT_INNER_FOREIGN_ENUM = ForeignEnum.BAV;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.foreign.ForeignEnum#ADAPTER"
  )
  public final ForeignEnum inner_foreign_enum;

  public ChildPackage(ForeignEnum inner_foreign_enum) {
    this(inner_foreign_enum, null);
  }

  public ChildPackage(ForeignEnum inner_foreign_enum, TagMap tagMap) {
    super(tagMap);
    this.inner_foreign_enum = inner_foreign_enum;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ChildPackage)) return false;
    ChildPackage o = (ChildPackage) other;
    return equals(tagMap(), o.tagMap())
        && equals(inner_foreign_enum, o.inner_foreign_enum);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = tagMap() != null ? tagMap().hashCode() : 0;
      result = result * 37 + (inner_foreign_enum != null ? inner_foreign_enum.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<ChildPackage, Builder> {
    public ForeignEnum inner_foreign_enum;

    public Builder() {
    }

    public Builder(ChildPackage message) {
      super(message);
      if (message == null) return;
      this.inner_foreign_enum = message.inner_foreign_enum;
    }

    public Builder inner_foreign_enum(ForeignEnum inner_foreign_enum) {
      this.inner_foreign_enum = inner_foreign_enum;
      return this;
    }

    @Override
    public ChildPackage build() {
      return new ChildPackage(inner_foreign_enum, buildTagMap());
    }
  }
}
