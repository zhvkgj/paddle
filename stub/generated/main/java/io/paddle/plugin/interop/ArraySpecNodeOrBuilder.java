// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: project.proto

package io.paddle.plugin.interop;

public interface ArraySpecNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.paddle.plugin.interop.ArraySpecNode)
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
   * <code>.io.paddle.plugin.interop.SpecNode items = 3;</code>
   * @return Whether the items field is set.
   */
  boolean hasItems();
  /**
   * <code>.io.paddle.plugin.interop.SpecNode items = 3;</code>
   * @return The items.
   */
  io.paddle.plugin.interop.SpecNode getItems();
  /**
   * <code>.io.paddle.plugin.interop.SpecNode items = 3;</code>
   */
  io.paddle.plugin.interop.SpecNodeOrBuilder getItemsOrBuilder();
}
