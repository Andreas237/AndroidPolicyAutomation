.class public Lo/zo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private c:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lo/zo;->c:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/zo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/zo;->e:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/zo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 57
    iput p1, p0, Lo/zo;->a:I

    .line 58
    return-void
.end method

.method public e()I
    .locals 1

    .line 52
    iget v0, p0, Lo/zo;->a:I

    return v0
.end method
