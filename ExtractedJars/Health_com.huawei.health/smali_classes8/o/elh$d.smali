.class public Lo/elh$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elh$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/elh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:F

.field public d:F


# direct methods
.method public constructor <init>(F)V
    .locals 1

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 206
    iput p1, p0, Lo/elh$d;->d:F

    .line 207
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p1, v0

    iput v0, p0, Lo/elh$d;->a:F

    .line 208
    return-void
.end method
