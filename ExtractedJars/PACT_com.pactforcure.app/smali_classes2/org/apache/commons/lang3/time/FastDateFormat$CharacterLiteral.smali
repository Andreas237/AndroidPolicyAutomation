.class Lorg/apache/commons/lang3/time/FastDateFormat$CharacterLiteral;
.super Ljava/lang/Object;
.source "FastDateFormat.java"

# interfaces
.implements Lorg/apache/commons/lang3/time/FastDateFormat$Rule;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/lang3/time/FastDateFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CharacterLiteral"
.end annotation


# instance fields
.field private final mValue:C


# direct methods
.method constructor <init>(C)V
    .locals 0
    .param p1, "value"    # C

    .prologue
    .line 936
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 937
    iput-char p1, p0, Lorg/apache/commons/lang3/time/FastDateFormat$CharacterLiteral;->mValue:C

    .line 938
    return-void
.end method


# virtual methods
.method public appendTo(Ljava/lang/StringBuffer;Ljava/util/Calendar;)V
    .locals 1
    .param p1, "buffer"    # Ljava/lang/StringBuffer;
    .param p2, "calendar"    # Ljava/util/Calendar;

    .prologue
    .line 951
    iget-char v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat$CharacterLiteral;->mValue:C

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 952
    return-void
.end method

.method public estimateLength()I
    .locals 1

    .prologue
    .line 944
    const/4 v0, 0x1

    return v0
.end method
