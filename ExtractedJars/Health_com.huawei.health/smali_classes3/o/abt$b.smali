.class Lo/abt$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:J

.field private d:I


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 71
    const-wide/16 v0, -0x1

    const/4 v2, -0x1

    invoke-direct {p0, v0, v1, v2}, Lo/abt$b;-><init>(JI)V

    .line 72
    return-void
.end method

.method private constructor <init>(JI)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-wide p1, p0, Lo/abt$b;->a:J

    .line 76
    iput p3, p0, Lo/abt$b;->d:I

    .line 77
    return-void
.end method

.method synthetic constructor <init>(Lo/abt$5;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lo/abt$b;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/abt$b;I)I
    .locals 0

    .line 66
    iput p1, p0, Lo/abt$b;->d:I

    return p1
.end method

.method static synthetic b(Lo/abt$b;)J
    .locals 2

    .line 66
    iget-wide v0, p0, Lo/abt$b;->a:J

    return-wide v0
.end method

.method static synthetic c(Lo/abt$b;J)J
    .locals 0

    .line 66
    iput-wide p1, p0, Lo/abt$b;->a:J

    return-wide p1
.end method

.method static synthetic d(Lo/abt$b;)I
    .locals 1

    .line 66
    iget v0, p0, Lo/abt$b;->d:I

    return v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 81
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
