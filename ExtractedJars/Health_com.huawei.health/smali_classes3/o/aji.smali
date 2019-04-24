.class public Lo/aji;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/fly;


# direct methods
.method public constructor <init>(Lo/fly;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lo/aji;->a:Lo/fly;

    .line 23
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/aji;->a:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()[B
    .locals 1

    .line 58
    iget-object v0, p0, Lo/aji;->a:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->l()[B

    move-result-object v0

    return-object v0
.end method
