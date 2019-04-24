.class public Lo/dvx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lo/dvx;->a:Ljava/lang/String;

    .line 27
    iput p2, p0, Lo/dvx;->c:I

    .line 28
    iput p3, p0, Lo/dvx;->e:I

    .line 29
    iput-object p4, p0, Lo/dvx;->b:Ljava/lang/String;

    .line 30
    iput-object p5, p0, Lo/dvx;->d:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/dvx;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 42
    iget v0, p0, Lo/dvx;->e:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/dvx;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 38
    iget v0, p0, Lo/dvx;->c:I

    return v0
.end method
