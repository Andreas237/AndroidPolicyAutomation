.class public Lo/dvv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lo/dvv;->a:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lo/dvv;->b:Ljava/lang/String;

    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lo/dvv;->a:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lo/dvv;->b:Ljava/lang/String;

    .line 19
    iput-object p1, p0, Lo/dvv;->a:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lo/dvv;->b:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Lo/dvv;->c:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/dvv;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/dvv;->a:Ljava/lang/String;

    return-object v0
.end method
