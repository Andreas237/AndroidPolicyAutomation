.class public Lo/bcv$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bcv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 63
    iget v0, p0, Lo/bcv$c;->a:I

    const/4 v1, 0x1

    shl-int/2addr v1, p1

    or-int/2addr v0, v1

    iput v0, p0, Lo/bcv$c;->a:I

    .line 64
    return-void
.end method

.method public b()V
    .locals 1

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lo/bcv$c;->a:I

    .line 72
    return-void
.end method

.method public c(I)Z
    .locals 2

    .line 49
    iget v0, p0, Lo/bcv$c;->a:I

    const/4 v1, 0x1

    shl-int/2addr v1, p1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
