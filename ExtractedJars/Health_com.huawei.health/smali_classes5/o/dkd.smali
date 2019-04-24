.class public Lo/dkd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/4 v0, -0x1

    iput v0, p0, Lo/dkd;->a:I

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lo/dkd;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 17
    iget v0, p0, Lo/dkd;->a:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 13
    iput p1, p0, Lo/dkd;->a:I

    .line 14
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lo/dkd;->e:Ljava/lang/String;

    .line 22
    return-void
.end method
