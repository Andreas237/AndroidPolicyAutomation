.class public Lo/ahi$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private c:Landroid/os/Bundle;

.field private d:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lo/ahi$a;->b:Ljava/lang/String;

    .line 64
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lo/ahi$a;->c:Landroid/os/Bundle;

    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/content/Intent;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lo/ahi$a;->b:Ljava/lang/String;

    .line 74
    iput-object p2, p0, Lo/ahi$a;->d:Landroid/content/Intent;

    .line 75
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lo/ahi$a;->b:Ljava/lang/String;

    .line 69
    iput-object p2, p0, Lo/ahi$a;->c:Landroid/os/Bundle;

    .line 70
    return-void
.end method

.method static synthetic e(Lo/ahi$a;)Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/ahi$a;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lo/ahi$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Landroid/os/Bundle;
    .locals 1

    .line 82
    iget-object v0, p0, Lo/ahi$a;->c:Landroid/os/Bundle;

    return-object v0
.end method

.method public e()Landroid/content/Intent;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/ahi$a;->d:Landroid/content/Intent;

    return-object v0
.end method
