.class public final Lcom/scandit/parser/DataFormat;
.super Ljava/lang/Object;
.source "DataFormat.java"


# static fields
.field public static final DLID:I

.field public static final GS1AI:I

.field public static final HIBC:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    invoke-static {}, Lcom/scandit/recognition/Native;->SP_PARSER_TYPE_GS1_AI_get()I

    move-result v0

    sput v0, Lcom/scandit/parser/DataFormat;->GS1AI:I

    .line 15
    invoke-static {}, Lcom/scandit/recognition/Native;->SP_PARSER_TYPE_HIBC_get()I

    move-result v0

    sput v0, Lcom/scandit/parser/DataFormat;->HIBC:I

    .line 16
    invoke-static {}, Lcom/scandit/recognition/Native;->SP_PARSER_TYPE_DLID_get()I

    move-result v0

    sput v0, Lcom/scandit/parser/DataFormat;->DLID:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
