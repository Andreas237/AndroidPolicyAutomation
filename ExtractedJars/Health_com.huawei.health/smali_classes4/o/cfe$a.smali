.class public Lo/cfe$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cfe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cfe$a;->b:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cfe$a;->c:Z

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cfe$a;->a:Z

    return-void
.end method


# virtual methods
.method public a(Z)Lo/cfe$a;
    .locals 0

    .line 73
    iput-boolean p1, p0, Lo/cfe$a;->a:Z

    .line 74
    return-object p0
.end method

.method public c(Z)Lo/cfe$a;
    .locals 0

    .line 68
    iput-boolean p1, p0, Lo/cfe$a;->c:Z

    .line 69
    return-object p0
.end method

.method public d(Z)Lo/cfe$a;
    .locals 0

    .line 63
    iput-boolean p1, p0, Lo/cfe$a;->b:Z

    .line 64
    return-object p0
.end method
