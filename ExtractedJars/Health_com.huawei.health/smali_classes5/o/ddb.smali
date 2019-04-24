.class public Lo/ddb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const v0, 0x31128

    iput v0, p0, Lo/ddb;->b:I

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddb;->d:Ljava/lang/Object;

    .line 14
    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const v0, 0x31128

    iput v0, p0, Lo/ddb;->b:I

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ddb;->d:Ljava/lang/Object;

    .line 17
    iput p1, p0, Lo/ddb;->b:I

    .line 18
    iput-object p2, p0, Lo/ddb;->d:Ljava/lang/Object;

    .line 19
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/ddb;->d:Ljava/lang/Object;

    .line 45
    return-void
.end method

.method public d()I
    .locals 1

    .line 32
    iget v0, p0, Lo/ddb;->b:I

    return v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ddb;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 36
    iput p1, p0, Lo/ddb;->b:I

    .line 37
    return-void
.end method
