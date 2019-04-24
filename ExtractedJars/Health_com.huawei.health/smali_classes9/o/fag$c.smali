.class public Lo/fag$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field a:F

.field b:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    const/4 v0, 0x0

    iput v0, p0, Lo/fag$c;->b:F

    .line 173
    const/4 v0, 0x0

    iput v0, p0, Lo/fag$c;->a:F

    return-void
.end method
