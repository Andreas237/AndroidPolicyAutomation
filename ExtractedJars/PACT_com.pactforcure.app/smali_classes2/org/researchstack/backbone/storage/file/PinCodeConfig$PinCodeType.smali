.class public final enum Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;
.super Ljava/lang/Enum;
.source "PinCodeConfig.java"

# interfaces
.implements Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/storage/file/PinCodeConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PinCodeType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;",
        ">;",
        "Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

.field public static final enum AlphaNumeric:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

.field public static final enum Alphabetic:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

.field public static final enum Numeric:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;


# instance fields
.field private filter:Landroid/text/InputFilter;

.field private inputType:I

.field private inputTypeHidden:I

.field private inputTypeVisible:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    .line 67
    new-instance v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    const-string v1, "Alphabetic"

    const/4 v2, 0x0

    const/high16 v3, 0x80000

    const/4 v4, 0x0

    const/16 v5, 0x80

    new-instance v6, Lorg/researchstack/backbone/utils/TextUtils$AlphabeticFilter;

    invoke-direct {v6}, Lorg/researchstack/backbone/utils/TextUtils$AlphabeticFilter;-><init>()V

    invoke-direct/range {v0 .. v6}, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;-><init>(Ljava/lang/String;IIIILandroid/text/InputFilter;)V

    sput-object v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->Alphabetic:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    .line 72
    new-instance v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    const-string v1, "Numeric"

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/16 v5, 0x10

    new-instance v6, Lorg/researchstack/backbone/utils/TextUtils$NumericFilter;

    invoke-direct {v6}, Lorg/researchstack/backbone/utils/TextUtils$NumericFilter;-><init>()V

    invoke-direct/range {v0 .. v6}, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;-><init>(Ljava/lang/String;IIIILandroid/text/InputFilter;)V

    sput-object v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->Numeric:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    .line 77
    new-instance v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    const-string v1, "AlphaNumeric"

    const/4 v2, 0x2

    const/high16 v3, 0x80000

    const/4 v4, 0x0

    const/16 v5, 0x80

    new-instance v6, Lorg/researchstack/backbone/utils/TextUtils$AlphanumericFilter;

    invoke-direct {v6}, Lorg/researchstack/backbone/utils/TextUtils$AlphanumericFilter;-><init>()V

    invoke-direct/range {v0 .. v6}, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;-><init>(Ljava/lang/String;IIIILandroid/text/InputFilter;)V

    sput-object v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->AlphaNumeric:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    .line 65
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    const/4 v1, 0x0

    sget-object v2, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->Alphabetic:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->Numeric:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->AlphaNumeric:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    aput-object v2, v0, v1

    sput-object v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->$VALUES:[Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIILandroid/text/InputFilter;)V
    .locals 0
    .param p3, "inputType"    # I
    .param p4, "inputTypeVisible"    # I
    .param p5, "inputTypeHidden"    # I
    .param p6, "filter"    # Landroid/text/InputFilter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Landroid/text/InputFilter;",
            ")V"
        }
    .end annotation

    .prologue
    .line 88
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 89
    iput p3, p0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->inputType:I

    .line 90
    iput p4, p0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->inputTypeVisible:I

    .line 91
    iput p5, p0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->inputTypeHidden:I

    .line 92
    iput-object p6, p0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->filter:Landroid/text/InputFilter;

    .line 93
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 65
    const-class v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    return-object v0
.end method

.method public static values()[Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->$VALUES:[Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    invoke-virtual {v0}, [Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    return-object v0
.end method


# virtual methods
.method public getInputFilter()Landroid/text/InputFilter;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->filter:Landroid/text/InputFilter;

    return-object v0
.end method

.method public getInputType()I
    .locals 1

    .prologue
    .line 98
    iget v0, p0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->inputType:I

    return v0
.end method

.method public getInputTypeStringId()I
    .locals 1

    .prologue
    .line 104
    sget-object v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->Numeric:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    if-ne p0, v0, :cond_0

    .line 106
    sget v0, Lorg/researchstack/backbone/R$string;->rsb_pincode_enter_digit:I

    .line 114
    :goto_0
    return v0

    .line 108
    :cond_0
    sget-object v0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->Alphabetic:Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;

    if-ne p0, v0, :cond_1

    .line 110
    sget v0, Lorg/researchstack/backbone/R$string;->rsb_pincode_enter_letter:I

    goto :goto_0

    .line 114
    :cond_1
    sget v0, Lorg/researchstack/backbone/R$string;->rsb_pincode_enter_character:I

    goto :goto_0
.end method

.method public getVisibleVariationType(Z)I
    .locals 1
    .param p1, "visible"    # Z

    .prologue
    .line 127
    if-eqz p1, :cond_0

    iget v0, p0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->inputTypeVisible:I

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lorg/researchstack/backbone/storage/file/PinCodeConfig$PinCodeType;->inputTypeHidden:I

    goto :goto_0
.end method
