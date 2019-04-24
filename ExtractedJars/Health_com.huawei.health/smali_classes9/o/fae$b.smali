.class public Lo/fae$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fae;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field protected b:F

.field protected c:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 891
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 893
    const/4 v0, 0x0

    iput v0, p0, Lo/fae$b;->c:F

    .line 895
    const/4 v0, 0x0

    iput v0, p0, Lo/fae$b;->b:F

    return-void
.end method
