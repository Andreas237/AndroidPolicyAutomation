.class Lo/amf$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field b:Z

.field c:I

.field d:I

.field e:J


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 301
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/amf$c;->b:Z

    .line 302
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amf$c;->e:J

    .line 303
    const/4 v0, 0x0

    iput v0, p0, Lo/amf$c;->c:I

    .line 304
    const/4 v0, 0x0

    iput v0, p0, Lo/amf$c;->d:I

    return-void
.end method

.method synthetic constructor <init>(Lo/amf$4;)V
    .locals 0

    .line 300
    invoke-direct {p0}, Lo/amf$c;-><init>()V

    return-void
.end method
