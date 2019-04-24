.class Lo/eih$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# instance fields
.field a:F

.field c:I

.field d:I

.field e:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1866
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1867
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eih$f;->e:Z

    .line 1868
    const/16 v0, 0x1e

    iput v0, p0, Lo/eih$f;->c:I

    .line 1869
    const/16 v0, 0x1e

    iput v0, p0, Lo/eih$f;->d:I

    .line 1872
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/eih$f;->a:F

    return-void
.end method

.method synthetic constructor <init>(Lo/eih$4;)V
    .locals 0

    .line 1866
    invoke-direct {p0}, Lo/eih$f;-><init>()V

    return-void
.end method
