// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: project.proto

package io.paddle.plugin.interop;

public interface StringSpecNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.paddle.plugin.interop.StringSpecNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated string valid = 3;</code>
   * @return A list containing the valid.
   */
  java.util.List<java.lang.String>
      getValidList();
  /**
   * <code>repeated string valid = 3;</code>
   * @return The count of valid.
   */
  int getValidCount();
  /**
   * <code>repeated string valid = 3;</code>
   * @param index The index of the element to return.
   * @return The valid at the given index.
   */
  java.lang.String getValid(int index);
  /**
   * <code>repeated string valid = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the valid at the given index.
   */
  com.google.protobuf.ByteString
      getValidBytes(int index);
}
