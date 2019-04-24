.class public Lo/apb;
.super Landroid/text/InputFilter$LengthFilter;
.source "SourceFile"


# instance fields
.field private b:I

.field private d:J


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 65
    invoke-direct {p0, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 53
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/apb;->d:J

    .line 66
    iput p1, p0, Lo/apb;->b:I

    .line 67
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 112
    iget v0, p0, Lo/apb;->b:I

    .line 113
    return v0
.end method

.method public d()V
    .locals 6

    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 96
    iget-wide v0, p0, Lo/apb;->d:J

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 99
    return-void

    .line 102
    :cond_0
    iput-wide v4, p0, Lo/apb;->d:J

    .line 104
    const/4 v0, 0x3

    const/16 v1, 0x259

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 105
    return-void
.end method

.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 4

    .line 72
    iget v0, p0, Lo/apb;->b:I

    invoke-interface {p4}, Landroid/text/Spanned;->length()I

    move-result v1

    sub-int v2, p6, p5

    sub-int/2addr v1, v2

    sub-int v3, v0, v1

    .line 74
    if-gtz v3, :cond_0

    .line 77
    invoke-virtual {p0}, Lo/apb;->d()V

    .line 79
    const/16 v0, 0xa

    const/16 v1, 0x7ea

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 83
    :cond_0
    invoke-super/range {p0 .. p6}, Landroid/text/InputFilter$LengthFilter;->filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method
