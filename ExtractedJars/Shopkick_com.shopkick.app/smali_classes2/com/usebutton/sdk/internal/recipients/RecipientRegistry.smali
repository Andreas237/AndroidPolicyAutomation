.class public Lcom/usebutton/sdk/internal/recipients/RecipientRegistry;
.super Ljava/lang/Object;
.source "RecipientRegistry.java"


# static fields
.field public static final ENHANCEMENT_BUTTON_AUTH_CHALLENGE_V1:Ljava/lang/String; = "btn_auth_challenge_v1"

.field public static final ENHANCEMENT_BUTTON_AUTH_CHALLENGE_V2:Ljava/lang/String; = "btn_auth_challenge_v2"

.field public static final ENHANCEMENT_BUTTON_AUTOFILL_V1:Ljava/lang/String; = "autofill_v1"

.field public static final ENHANCEMENT_BUTTON_AUTOFILL_V1_1:Ljava/lang/String; = "autofill_v1.1"

.field public static final ENHANCEMENT_BUTTON_LIST_GROUPED_V1:Ljava/lang/String; = "btn_inventory_grouped_picker_v1"

.field public static final ENHANCEMENT_BUTTON_LIST_PICKER_V1:Ljava/lang/String; = "btn_inventory_list_picker_v1"

.field public static final ENHANCEMENT_BUTTON_PRODUCT_V1:Ljava/lang/String; = "btn_product_detail_v1"

.field public static final ENHANCEMENT_BUTTON_RIDE_INVENTORY_V1:Ljava/lang/String; = "button_inventory_ride_v1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getEnhancements()[Ljava/lang/String;
    .locals 8

    const-string v0, "button_inventory_ride_v1"

    const-string v1, "btn_inventory_list_picker_v1"

    const-string v2, "btn_inventory_grouped_picker_v1"

    const-string v3, "btn_product_detail_v1"

    const-string v4, "btn_auth_challenge_v1"

    const-string v5, "btn_auth_challenge_v2"

    const-string v6, "autofill_v1"

    const-string v7, "autofill_v1.1"

    .line 15
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
