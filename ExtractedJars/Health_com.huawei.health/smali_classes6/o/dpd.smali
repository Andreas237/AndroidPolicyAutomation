.class public Lo/dpd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lo/dpd;->c:Ljava/lang/String;

    .line 23
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lo/dpd;->b:Ljava/lang/String;

    .line 15
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lo/dpd;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lo/dpd;->b:Ljava/lang/String;

    return-object v0
.end method
