.class Lo/dhq$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dhq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private b:Lo/dhj;

.field private d:J


# direct methods
.method public constructor <init>(JLo/dhj;)V
    .locals 2

    .line 716
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 693
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dhq$a;->d:J

    .line 717
    iput-wide p1, p0, Lo/dhq$a;->d:J

    .line 718
    iput-object p3, p0, Lo/dhq$a;->b:Lo/dhj;

    .line 719
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 701
    iget-wide v0, p0, Lo/dhq$a;->d:J

    return-wide v0
.end method

.method public d()Lo/dhj;
    .locals 1

    .line 705
    iget-object v0, p0, Lo/dhq$a;->b:Lo/dhj;

    return-object v0
.end method
