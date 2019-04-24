.class public final Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/provider/BaseColumns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/storage/db/DataModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CardOrderColumns"
.end annotation


# static fields
.field public static final COLUMN_NAME_REFENCE_ID:Ljava/lang/String; = "reference_id"

.field public static final COLUMN_NAME_TIMESTAMP:Ljava/lang/String; = "timestamp"

.field public static final CONTENT_URI:Landroid/net/Uri;

.field public static final TABLE_NAME:Ljava/lang/String; = "card_order_info"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 293
    const-string v0, "content://com.huawei.health/card_order_info"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 283
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
