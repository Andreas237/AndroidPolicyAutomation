.class public Lcom/scandit/recognition/Native;
.super Ljava/lang/Object;
.source "Native.java"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "scanditsdk-android-5.4.2"

    .line 16
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native SC_ALL_SYMBOLOGIES_COUNT_get()I
.end method

.method public static final native SC_ALL_SYMBOLOGIES_get()J
.end method

.method public static final native SC_CAMERA_FACING_DIRECTION_BACK_get()I
.end method

.method public static final native SC_CAMERA_FACING_DIRECTION_FRONT_get()I
.end method

.method public static final native SC_CAMERA_FACING_DIRECTION_UNKNOWN_get()I
.end method

.method public static final native SC_CAMERA_FOCUS_MODE_AUTO_get()I
.end method

.method public static final native SC_CAMERA_FOCUS_MODE_FIXED_get()I
.end method

.method public static final native SC_CAMERA_FOCUS_MODE_MANUAL_get()I
.end method

.method public static final native SC_CAMERA_FOCUS_MODE_UNKNOWN_get()I
.end method

.method public static final native SC_CHECKSUM_MOD_1010_get()I
.end method

.method public static final native SC_CHECKSUM_MOD_103_get()I
.end method

.method public static final native SC_CHECKSUM_MOD_10_get()I
.end method

.method public static final native SC_CHECKSUM_MOD_1110_get()I
.end method

.method public static final native SC_CHECKSUM_MOD_11_get()I
.end method

.method public static final native SC_CHECKSUM_MOD_16_get()I
.end method

.method public static final native SC_CHECKSUM_MOD_43_get()I
.end method

.method public static final native SC_CHECKSUM_MOD_47_get()I
.end method

.method public static final native SC_CHECKSUM_NONE_get()I
.end method

.method public static final native SC_CODE_DIRECTION_BOTTOM_TO_TOP_get()I
.end method

.method public static final native SC_CODE_DIRECTION_HORIZONTAL_get()I
.end method

.method public static final native SC_CODE_DIRECTION_LEFT_TO_RIGHT_get()I
.end method

.method public static final native SC_CODE_DIRECTION_NONE_get()I
.end method

.method public static final native SC_CODE_DIRECTION_RIGHT_TO_LEFT_get()I
.end method

.method public static final native SC_CODE_DIRECTION_TOP_TO_BOTTOM_get()I
.end method

.method public static final native SC_CODE_DIRECTION_VERTICAL_get()I
.end method

.method public static final native SC_CODE_LOCATION_HINT_get()I
.end method

.method public static final native SC_CODE_LOCATION_RESTRICT_get()I
.end method

.method public static final native SC_COMPOSITE_FLAG_GS1_A_get()I
.end method

.method public static final native SC_COMPOSITE_FLAG_GS1_B_get()I
.end method

.method public static final native SC_COMPOSITE_FLAG_GS1_C_get()I
.end method

.method public static final native SC_COMPOSITE_FLAG_LINKED_get()I
.end method

.method public static final native SC_COMPOSITE_FLAG_NONE_get()I
.end method

.method public static final native SC_COMPOSITE_FLAG_UNKNOWN_get()I
.end method

.method public static final native SC_DEVICE_ORIENTATION_LANDSCAPE_LEFT_get()I
.end method

.method public static final native SC_DEVICE_ORIENTATION_LANDSCAPE_RIGHT_get()I
.end method

.method public static final native SC_DEVICE_ORIENTATION_PORTRAIT_UPSIDE_DOWN_get()I
.end method

.method public static final native SC_DEVICE_ORIENTATION_PORTRAIT_get()I
.end method

.method public static final native SC_DEVICE_ORIENTATION_UNKNOWN_get()I
.end method

.method public static final native SC_FOCUS_RANGE_FAR_get()I
.end method

.method public static final native SC_FOCUS_RANGE_FULL_get()I
.end method

.method public static final native SC_FOCUS_RANGE_NEAR_get()I
.end method

.method public static final native SC_FOCUS_TRIGGER_AT_POINT_get()I
.end method

.method public static final native SC_FOCUS_TRIGGER_CONTINUOUS_get()I
.end method

.method public static final native SC_FOCUS_TRIGGER_NONE_get()I
.end method

.method public static final native SC_HIDDEN_PRESET_ENABLE_PRE4_6_SETTINGS_get()I
.end method

.method public static final native SC_HIDDEN_PRESET_ENABLE_PRE4_6_SETTINGS_set(I)V
.end method

.method public static final native SC_IMAGE_FORMAT_GRAY_get()I
.end method

.method public static final native SC_IMAGE_FORMAT_RGB_get()I
.end method

.method public static final native SC_IMAGE_FORMAT_YUV_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_GRAY_8U_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_I420_8U_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_RGBA_8U_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_RGB_8U_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_UNKNOWN_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_UYVY_8U_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_YPCBCR_8U_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_YPCRCB_8U_get()I
.end method

.method public static final native SC_IMAGE_LAYOUT_YUYV_8U_get()I
.end method

.method public static final native SC_PLANE_CHANNEL_A_get()I
.end method

.method public static final native SC_PLANE_CHANNEL_B_get()I
.end method

.method public static final native SC_PLANE_CHANNEL_G_get()I
.end method

.method public static final native SC_PLANE_CHANNEL_R_get()I
.end method

.method public static final native SC_PLANE_CHANNEL_U_get()I
.end method

.method public static final native SC_PLANE_CHANNEL_V_get()I
.end method

.method public static final native SC_PLANE_CHANNEL_Y_get()I
.end method

.method public static final native SC_PRESET_ENABLE_PRE4_6_SETTINGS_get()I
.end method

.method public static final native SC_PRESET_ENABLE_RETAIL_SYMBOLOGIES_get()I
.end method

.method public static final native SC_PRESET_ENABLE_SINGLE_FRAME_MODE_get()I
.end method

.method public static final native SC_PRESET_ENABLE_SSCC_DECODING_get()I
.end method

.method public static final native SC_PRESET_ENABLE_VIN_DECODING_get()I
.end method

.method public static final native SC_PRESET_NONE_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_FRAME_SEQUENCE_NOT_STARTED_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_INCONSISTENT_IMAGE_DATA_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_INTERNAL_ERROR_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_INVALID_APP_ID_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_INVALID_DEVICE_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_INVALID_PLATFORM_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_INVALID_SDK_VERSION_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_LICENSE_FILE_EXPIRED_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_LICENSE_FILE_IO_ERROR_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_LICENSE_KEY_EXPIRED_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_LICENSE_KEY_INVALID_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_LICENSE_KEY_MISSING_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_LICENSE_VALIDATION_FAILED_400_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_LICENSE_VALIDATION_FAILED_403_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_LICENSE_VALIDATION_FAILED_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_NO_NETWORK_CONNECTION_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_SUCCESS_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_UNKNOWN_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_UNLICENSED_FEATURE_BEGIN_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_UNLICENSED_FEATURE_END_get()I
.end method

.method public static final native SC_RECOGNITION_CONTEXT_STATUS_UNSUPPORTED_IMAGE_DATA_get()I
.end method

.method public static final native SC_SDK_FEATURE_HIDE_LOGO_get()I
.end method

.method public static final native SC_SDK_FEATURE_OCR_get()I
.end method

.method public static final native SC_SDK_FEATURE_ONLINE_VERIFICATION_get()I
.end method

.method public static final native SC_SYMBOLOGY_AZTEC_get()I
.end method

.method public static final native SC_SYMBOLOGY_CODABAR_get()I
.end method

.method public static final native SC_SYMBOLOGY_CODE11_get()I
.end method

.method public static final native SC_SYMBOLOGY_CODE128_get()I
.end method

.method public static final native SC_SYMBOLOGY_CODE25_get()I
.end method

.method public static final native SC_SYMBOLOGY_CODE39_get()I
.end method

.method public static final native SC_SYMBOLOGY_CODE93_get()I
.end method

.method public static final native SC_SYMBOLOGY_DATA_MATRIX_get()I
.end method

.method public static final native SC_SYMBOLOGY_EAN13_get()I
.end method

.method public static final native SC_SYMBOLOGY_EAN8_get()I
.end method

.method public static final native SC_SYMBOLOGY_FIVE_DIGIT_ADD_ON_get()I
.end method

.method public static final native SC_SYMBOLOGY_GS1_DATABAR_EXPANDED_get()I
.end method

.method public static final native SC_SYMBOLOGY_GS1_DATABAR_LIMITED_get()I
.end method

.method public static final native SC_SYMBOLOGY_GS1_DATABAR_get()I
.end method

.method public static final native SC_SYMBOLOGY_INTERLEAVED_2_OF_5_get()I
.end method

.method public static final native SC_SYMBOLOGY_KIX_get()I
.end method

.method public static final native SC_SYMBOLOGY_MAXICODE_get()I
.end method

.method public static final native SC_SYMBOLOGY_MICRO_PDF417_get()I
.end method

.method public static final native SC_SYMBOLOGY_MSI_PLESSEY_get()I
.end method

.method public static final native SC_SYMBOLOGY_PDF417_get()I
.end method

.method public static final native SC_SYMBOLOGY_QR_get()I
.end method

.method public static final native SC_SYMBOLOGY_RM4SCC_get()I
.end method

.method public static final native SC_SYMBOLOGY_TWO_DIGIT_ADD_ON_get()I
.end method

.method public static final native SC_SYMBOLOGY_UNKNOWN_get()I
.end method

.method public static final native SC_SYMBOLOGY_UPCA_get()I
.end method

.method public static final native SC_SYMBOLOGY_UPCE_get()I
.end method

.method public static final native SC_TRACKED_OBJECT_TYPE_BARCODE_get()I
.end method

.method public static final native ScDefaultRestrictedScanAreaSizeLandscape_get()J
.end method

.method public static final native ScDefaultRestrictedScanAreaSizePortrait_get()J
.end method

.method public static final native ScEncodingArray_ranges_get(J)J
.end method

.method public static final native ScEncodingArray_ranges_set(JJ)V
.end method

.method public static final native ScEncodingArray_size_get(J)J
.end method

.method public static final native ScEncodingArray_size_set(JJ)V
.end method

.method public static final native ScEncodingRange_encoding_get(J)Ljava/lang/String;
.end method

.method public static final native ScEncodingRange_encoding_set(JLjava/lang/String;)V
.end method

.method public static final native ScEncodingRange_end_get(J)J
.end method

.method public static final native ScEncodingRange_end_set(JJ)V
.end method

.method public static final native ScEncodingRange_start_get(J)J
.end method

.method public static final native ScEncodingRange_start_set(JJ)V
.end method

.method public static final native ScError_code_get(J)J
.end method

.method public static final native ScError_code_set(JJ)V
.end method

.method public static final native ScError_message_get(J)Ljava/lang/String;
.end method

.method public static final native ScError_message_set(JLjava/lang/String;)V
.end method

.method public static final native ScFocusEvent_range_get(J)I
.end method

.method public static final native ScFocusEvent_range_set(JI)V
.end method

.method public static final native ScFocusEvent_rect_get(J)J
.end method

.method public static final native ScFocusEvent_rect_set(JJ)V
.end method

.method public static final native ScFocusEvent_trigger_get(J)I
.end method

.method public static final native ScFocusEvent_trigger_set(JI)V
.end method

.method public static final native ScFocusOptions_auto_focus_trigger_interval_get(J)F
.end method

.method public static final native ScFocusOptions_auto_focus_trigger_interval_set(JF)V
.end method

.method public static final native ScFocusOptions_focus_at_point_get(J)I
.end method

.method public static final native ScFocusOptions_focus_at_point_set(JI)V
.end method

.method public static final native ScFocusOptions_primary_range_get(J)I
.end method

.method public static final native ScFocusOptions_primary_range_set(JI)V
.end method

.method public static final native ScFocusOptions_requires_initial_manual_focus_get(J)I
.end method

.method public static final native ScFocusOptions_requires_initial_manual_focus_set(JI)V
.end method

.method public static final native ScFocusOptions_secondary_range_get(J)I
.end method

.method public static final native ScFocusOptions_secondary_range_set(JI)V
.end method

.method public static final native ScFocusOptions_supported_focus_modes_get(J)I
.end method

.method public static final native ScFocusOptions_supported_focus_modes_set(JI)V
.end method

.method public static final native ScImagePlane_channel_get(J)I
.end method

.method public static final native ScImagePlane_channel_set(JI)V
.end method

.method public static final native ScImagePlane_data_get(J)[B
.end method

.method public static final native ScImagePlane_data_set(J[B)V
.end method

.method public static final native ScImagePlane_height_get(J)J
.end method

.method public static final native ScImagePlane_height_set(JJ)V
.end method

.method public static final native ScImagePlane_pixel_stride_get(J)J
.end method

.method public static final native ScImagePlane_pixel_stride_set(JJ)V
.end method

.method public static final native ScImagePlane_row_stride_get(J)J
.end method

.method public static final native ScImagePlane_row_stride_set(JJ)V
.end method

.method public static final native ScImagePlane_subsampling_x_get(J)J
.end method

.method public static final native ScImagePlane_subsampling_x_set(JJ)V
.end method

.method public static final native ScImagePlane_subsampling_y_get(J)J
.end method

.method public static final native ScImagePlane_subsampling_y_set(JJ)V
.end method

.method public static final native ScImagePlane_width_get(J)J
.end method

.method public static final native ScImagePlane_width_set(JJ)V
.end method

.method public static final native ScObjectTrackerDebugCallbacks_on_object_created_get(J)J
.end method

.method public static final native ScObjectTrackerDebugCallbacks_on_object_created_set(JJ)V
.end method

.method public static final native ScObjectTrackerDebugCallbacks_on_object_deleted_get(J)J
.end method

.method public static final native ScObjectTrackerDebugCallbacks_on_object_deleted_set(JJ)V
.end method

.method public static final native ScPointF_x_get(J)F
.end method

.method public static final native ScPointF_x_set(JF)V
.end method

.method public static final native ScPointF_y_get(J)F
.end method

.method public static final native ScPointF_y_set(JF)V
.end method

.method public static final native ScPoint_x_get(J)I
.end method

.method public static final native ScPoint_x_set(JI)V
.end method

.method public static final native ScPoint_y_get(J)I
.end method

.method public static final native ScPoint_y_set(JI)V
.end method

.method public static final native ScProcessFrameResult_frame_id_get(J)J
.end method

.method public static final native ScProcessFrameResult_frame_id_set(JJ)V
.end method

.method public static final native ScProcessFrameResult_status_get(J)I
.end method

.method public static final native ScProcessFrameResult_status_set(JI)V
.end method

.method public static final native ScQuadrilateral_bottom_left_get(J)J
.end method

.method public static final native ScQuadrilateral_bottom_left_set(JJ)V
.end method

.method public static final native ScQuadrilateral_bottom_right_get(J)J
.end method

.method public static final native ScQuadrilateral_bottom_right_set(JJ)V
.end method

.method public static final native ScQuadrilateral_top_left_get(J)J
.end method

.method public static final native ScQuadrilateral_top_left_set(JJ)V
.end method

.method public static final native ScQuadrilateral_top_right_get(J)J
.end method

.method public static final native ScQuadrilateral_top_right_set(JJ)V
.end method

.method public static final native ScRectangleF_position_get(J)J
.end method

.method public static final native ScRectangleF_position_set(JJ)V
.end method

.method public static final native ScRectangleF_size_get(J)J
.end method

.method public static final native ScRectangleF_size_set(JJ)V
.end method

.method public static final native ScSizeF_height_get(J)F
.end method

.method public static final native ScSizeF_height_set(JF)V
.end method

.method public static final native ScSizeF_width_get(J)F
.end method

.method public static final native ScSizeF_width_set(JF)V
.end method

.method public static final native delete_ScEncodingArray(J)V
.end method

.method public static final native delete_ScEncodingRange(J)V
.end method

.method public static final native delete_ScError(J)V
.end method

.method public static final native delete_ScFocusEvent(J)V
.end method

.method public static final native delete_ScFocusOptions(J)V
.end method

.method public static final native delete_ScImagePlane(J)V
.end method

.method public static final native delete_ScObjectTrackerDebugCallbacks(J)V
.end method

.method public static final native delete_ScPoint(J)V
.end method

.method public static final native delete_ScPointF(J)V
.end method

.method public static final native delete_ScProcessFrameResult(J)V
.end method

.method public static final native delete_ScQuadrilateral(J)V
.end method

.method public static final native delete_ScRectangleF(J)V
.end method

.method public static final native delete_ScSizeF(J)V
.end method

.method public static final native new_ScEncodingArray()J
.end method

.method public static final native new_ScEncodingRange()J
.end method

.method public static final native new_ScError()J
.end method

.method public static final native new_ScFocusEvent()J
.end method

.method public static final native new_ScFocusOptions()J
.end method

.method public static final native new_ScImagePlane()J
.end method

.method public static final native new_ScObjectTrackerDebugCallbacks()J
.end method

.method public static final native new_ScPoint()J
.end method

.method public static final native new_ScPointF()J
.end method

.method public static final native new_ScProcessFrameResult()J
.end method

.method public static final native new_ScQuadrilateral()J
.end method

.method public static final native new_ScRectangleF()J
.end method

.method public static final native new_ScSizeF()J
.end method

.method public static final native sc_barcode_array_get_item_at(JJ)J
.end method

.method public static final native sc_barcode_array_get_size(J)J
.end method

.method public static final native sc_barcode_array_release(J)V
.end method

.method public static final native sc_barcode_convert_data_to_utf8(J)J
.end method

.method public static final native sc_barcode_fill_data(J[B)V
.end method

.method public static final native sc_barcode_get_composite_flag(J)I
.end method

.method public static final native sc_barcode_get_data_encoding(J)J
.end method

.method public static final native sc_barcode_get_data_length(J)I
.end method

.method public static final native sc_barcode_get_frame_id(J)J
.end method

.method public static final native sc_barcode_get_location(J)J
.end method

.method public static final native sc_barcode_get_symbol_count(J)I
.end method

.method public static final native sc_barcode_get_symbology(J)I
.end method

.method public static final native sc_barcode_is_gs1_data_carrier(J)I
.end method

.method public static final native sc_barcode_is_recognized(J)I
.end method

.method public static final native sc_barcode_release(J)V
.end method

.method public static final native sc_barcode_retain(J)V
.end method

.method public static final native sc_barcode_scanner_apply_settings(JJ)V
.end method

.method public static final native sc_barcode_scanner_get_session(J)J
.end method

.method public static final native sc_barcode_scanner_is_setup_complete(J)I
.end method

.method public static final native sc_barcode_scanner_new_with_settings(JJ)J
.end method

.method public static final native sc_barcode_scanner_release(J)V
.end method

.method public static final native sc_barcode_scanner_session_clear(J)V
.end method

.method public static final native sc_barcode_scanner_session_get_all_recognized_codes(J)J
.end method

.method public static final native sc_barcode_scanner_session_get_last_processed_frame_id(J)J
.end method

.method public static final native sc_barcode_scanner_session_get_newly_localized_codes(J)J
.end method

.method public static final native sc_barcode_scanner_session_get_newly_recognized_codes(J)J
.end method

.method public static final native sc_barcode_scanner_session_release(J)V
.end method

.method public static final native sc_barcode_scanner_session_retain(J)V
.end method

.method public static final native sc_barcode_scanner_settings_as_json(J)Ljava/lang/String;
.end method

.method public static final native sc_barcode_scanner_settings_clone(J)J
.end method

.method public static final native sc_barcode_scanner_settings_get_code_caching_duration(J)I
.end method

.method public static final native sc_barcode_scanner_settings_get_code_direction_hint(J)I
.end method

.method public static final native sc_barcode_scanner_settings_get_code_duplicate_filter(J)I
.end method

.method public static final native sc_barcode_scanner_settings_get_code_location_area_1d(J)J
.end method

.method public static final native sc_barcode_scanner_settings_get_code_location_area_2d(J)J
.end method

.method public static final native sc_barcode_scanner_settings_get_code_location_constraint_1d(J)I
.end method

.method public static final native sc_barcode_scanner_settings_get_code_location_constraint_2d(J)I
.end method

.method public static final native sc_barcode_scanner_settings_get_focus_mode(J)I
.end method

.method public static final native sc_barcode_scanner_settings_get_max_number_of_codes_per_frame(J)J
.end method

.method public static final native sc_barcode_scanner_settings_get_property(JLjava/lang/String;)I
.end method

.method public static final native sc_barcode_scanner_settings_get_search_area(J)J
.end method

.method public static final native sc_barcode_scanner_settings_get_symbology_settings(JI)J
.end method

.method public static final native sc_barcode_scanner_settings_new_from_json(Ljava/lang/String;J)J
.end method

.method public static final native sc_barcode_scanner_settings_new_with_preset(I)J
.end method

.method public static final native sc_barcode_scanner_settings_release(J)V
.end method

.method public static final native sc_barcode_scanner_settings_set_code_caching_duration(JI)V
.end method

.method public static final native sc_barcode_scanner_settings_set_code_direction_hint(JI)V
.end method

.method public static final native sc_barcode_scanner_settings_set_code_duplicate_filter(JI)V
.end method

.method public static final native sc_barcode_scanner_settings_set_code_location_area_1d(JJ)V
.end method

.method public static final native sc_barcode_scanner_settings_set_code_location_area_2d(JJ)V
.end method

.method public static final native sc_barcode_scanner_settings_set_code_location_constraint_1d(JI)V
.end method

.method public static final native sc_barcode_scanner_settings_set_code_location_constraint_2d(JI)V
.end method

.method public static final native sc_barcode_scanner_settings_set_focus_mode(JI)V
.end method

.method public static final native sc_barcode_scanner_settings_set_max_number_of_codes_per_frame(JJ)V
.end method

.method public static final native sc_barcode_scanner_settings_set_property(JLjava/lang/String;I)V
.end method

.method public static final native sc_barcode_scanner_settings_set_restricted_scan_area(JJJI)I
.end method

.method public static final native sc_barcode_scanner_settings_set_search_area(JJ)V
.end method

.method public static final native sc_barcode_scanner_settings_set_symbology_enabled(JII)V
.end method

.method public static final native sc_barcode_scanner_wait_for_setup_completed(J)I
.end method

.method public static final native sc_context_status_flag_get_message(I)Ljava/lang/String;
.end method

.method public static final native sc_copy_direct_uv_buffer_plane(Ljava/nio/ByteBuffer;[BIIIII)V
.end method

.method public static final native sc_encoding_array_free(J)V
.end method

.method public static final native sc_encoding_array_get_item_at(JJ)J
.end method

.method public static final native sc_encoding_array_get_size(J)J
.end method

.method public static final native sc_error_free(J)V
.end method

.method public static final native sc_focus_state_machine_manual_focus_at_xy(JFF)V
.end method

.method public static final native sc_focus_state_machine_new(J)J
.end method

.method public static final native sc_focus_state_machine_release(J)V
.end method

.method public static final native sc_focus_state_machine_reset(J)V
.end method

.method public static final native sc_focus_state_machine_retain(J)V
.end method

.method public static final native sc_focus_state_machine_set_focus_range(JII)V
.end method

.method public static final native sc_focus_state_machine_update(J)J
.end method

.method public static final native sc_free(J)V
.end method

.method public static final native sc_get_framework_version()Ljava/lang/String;
.end method

.method public static final native sc_get_information_string(I)Ljava/lang/String;
.end method

.method public static final native sc_image_description_get_first_plane_offset(J)J
.end method

.method public static final native sc_image_description_get_first_plane_row_bytes(J)J
.end method

.method public static final native sc_image_description_get_height(J)J
.end method

.method public static final native sc_image_description_get_layout(J)I
.end method

.method public static final native sc_image_description_get_memory_size(J)J
.end method

.method public static final native sc_image_description_get_second_plane_offset(J)J
.end method

.method public static final native sc_image_description_get_second_plane_row_bytes(J)J
.end method

.method public static final native sc_image_description_get_width(J)J
.end method

.method public static final native sc_image_description_new()J
.end method

.method public static final native sc_image_description_release(J)V
.end method

.method public static final native sc_image_description_set_first_plane_offset(JJ)V
.end method

.method public static final native sc_image_description_set_first_plane_row_bytes(JJ)V
.end method

.method public static final native sc_image_description_set_height(JJ)V
.end method

.method public static final native sc_image_description_set_layout(JI)V
.end method

.method public static final native sc_image_description_set_memory_size(JJ)V
.end method

.method public static final native sc_image_description_set_second_plane_offset(JJ)V
.end method

.method public static final native sc_image_description_set_second_plane_row_bytes(JJ)V
.end method

.method public static final native sc_image_description_set_width(JJ)V
.end method

.method public static final native sc_image_plane_array_get(JJ)J
.end method

.method public static final native sc_image_plane_assign(JIJJJJJJ)V
.end method

.method public static final native sc_image_plane_free_array(J)V
.end method

.method public static final native sc_image_plane_make_array(J)J
.end method

.method public static final native sc_image_plane_set_buffer(JLjava/nio/ByteBuffer;)V
.end method

.method public static final native sc_is_sharp(J[BJII)I
.end method

.method public static final native sc_license_name()Ljava/lang/String;
.end method

.method public static final native sc_object_tracker_is_enabled(J)I
.end method

.method public static final native sc_object_tracker_new(JLcom/scandit/recognition/NativeObjectTrackerCallback;)J
.end method

.method public static final native sc_object_tracker_new_debug(JLcom/scandit/recognition/NativeObjectTrackerCallback;JJ)J
.end method

.method public static final native sc_object_tracker_release(J)V
.end method

.method public static final native sc_object_tracker_retain(J)V
.end method

.method public static final native sc_object_tracker_set_enabled(JI)V
.end method

.method public static final native sc_point_f_make(FF)J
.end method

.method public static final native sc_point_make(II)J
.end method

.method public static final native sc_quadrilateral_make(JJJJ)J
.end method

.method public static final native sc_recognition_context_end_frame_sequence(J)V
.end method

.method public static final native sc_recognition_context_has_feature(JI)I
.end method

.method public static final native sc_recognition_context_new_full(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
.end method

.method public static final native sc_recognition_context_process_frame(JJ[B)J
.end method

.method public static final native sc_recognition_context_process_frame_address(JJJ)J
.end method

.method public static final native sc_recognition_context_process_planes(JJJ)J
.end method

.method public static final native sc_recognition_context_release(J)V
.end method

.method public static final native sc_recognition_context_report_auto_focus_done(J)V
.end method

.method public static final native sc_recognition_context_report_auto_focus_start(J)V
.end method

.method public static final native sc_recognition_context_report_camera_facing_direction(JI)V
.end method

.method public static final native sc_recognition_context_report_device_orientation(JI)V
.end method

.method public static final native sc_recognition_context_set_device_name(JLjava/lang/String;)V
.end method

.method public static final native sc_recognition_context_set_fake_dt(JF)V
.end method

.method public static final native sc_recognition_context_set_geographical_location(JFF)V
.end method

.method public static final native sc_recognition_context_start_new_frame_sequence(J)V
.end method

.method public static final native sc_rectangle_f_get_center(J)J
.end method

.method public static final native sc_rectangle_f_make(FFFF)J
.end method

.method public static final native sc_string_array_free(J)V
.end method

.method public static final native sc_string_array_get_at(JI)Ljava/lang/String;
.end method

.method public static final native sc_symbology_settings_fill_active_symbol_counts(J[B)V
.end method

.method public static final native sc_symbology_settings_get_active_symbol_counts_length(J)I
.end method

.method public static final native sc_symbology_settings_get_checksums(J)I
.end method

.method public static final native sc_symbology_settings_get_enabled_extensions(J)J
.end method

.method public static final native sc_symbology_settings_get_symbology(J)I
.end method

.method public static final native sc_symbology_settings_is_color_inverted_enabled(J)I
.end method

.method public static final native sc_symbology_settings_is_enabled(J)I
.end method

.method public static final native sc_symbology_settings_is_extension_enabled(JLjava/lang/String;)I
.end method

.method public static final native sc_symbology_settings_release(J)V
.end method

.method public static final native sc_symbology_settings_retain(J)V
.end method

.method public static final native sc_symbology_settings_set_active_symbol_counts2(J[SI)V
.end method

.method public static final native sc_symbology_settings_set_checksums(JI)V
.end method

.method public static final native sc_symbology_settings_set_color_inverted_enabled(JI)V
.end method

.method public static final native sc_symbology_settings_set_enabled(JI)V
.end method

.method public static final native sc_symbology_settings_set_extension_enabled(JLjava/lang/String;I)V
.end method

.method public static final native sc_symbology_to_string(I)Ljava/lang/String;
.end method

.method public static final native sc_tracked_object_get_id(J)J
.end method

.method public static final native sc_tracked_object_get_location(J)J
.end method

.method public static final native sc_tracked_object_get_type(J)I
.end method

.method public static final native sc_verify_license_key_and_restrict_settings(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)I
.end method
