.class public Lo/bjp;
.super Landroid/text/InputFilter$LengthFilter;
.source "SourceFile"


# instance fields
.field private b:J

.field private e:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 48
    invoke-direct {p0, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 36
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bjp;->b:J

    .line 49
    iput p1, p0, Lo/bjp;->e:I

    .line 50
    return-void
.end method


# virtual methods
.method public c()V
    .locals 6

    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 69
    iget-wide v0, p0, Lo/bjp;->b:J

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 72
    return-void

    .line 74
    :cond_0
    iput-wide v4, p0, Lo/bjp;->b:J

    .line 75
    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_input_reached_max_words:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 76
    return-void
.end method

.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 4

    .line 55
    iget v0, p0, Lo/bjp;->e:I

    invoke-interface {p4}, Landroid/text/Spanned;->length()I

    move-result v1

    sub-int v2, p6, p5

    sub-int/2addr v1, v2

    sub-int v3, v0, v1

    .line 56
    if-gtz v3, :cond_0

    .line 58
    invoke-virtual {p0}, Lo/bjp;->c()V

    .line 60
    :cond_0
    invoke-super/range {p0 .. p6}, Landroid/text/InputFilter$LengthFilter;->filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method
