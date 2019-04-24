.class public Lcom/squareup/haha/perflib/ThreadObj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field mId:J

.field mStackTrace:I


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-wide p1, p0, Lcom/squareup/haha/perflib/ThreadObj;->mId:J

    .line 27
    iput p3, p0, Lcom/squareup/haha/perflib/ThreadObj;->mStackTrace:I

    .line 28
    return-void
.end method
