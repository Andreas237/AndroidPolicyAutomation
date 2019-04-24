.class final Lo/ta;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ta$a;
    }
.end annotation


# instance fields
.field private a:I

.field private e:Lo/ta$a;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/ta;->a:I

    .line 45
    sget-object v0, Lo/ta$a;->b:Lo/ta$a;

    iput-object v0, p0, Lo/ta;->e:Lo/ta$a;

    .line 46
    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    .line 61
    iget-object v0, p0, Lo/ta;->e:Lo/ta$a;

    sget-object v1, Lo/ta$a;->a:Lo/ta$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method b()V
    .locals 1

    .line 73
    sget-object v0, Lo/ta$a;->b:Lo/ta$a;

    iput-object v0, p0, Lo/ta;->e:Lo/ta$a;

    .line 74
    return-void
.end method

.method c()I
    .locals 1

    .line 49
    iget v0, p0, Lo/ta;->a:I

    return v0
.end method

.method c(I)V
    .locals 1

    .line 57
    iget v0, p0, Lo/ta;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/ta;->a:I

    .line 58
    return-void
.end method

.method d()V
    .locals 1

    .line 77
    sget-object v0, Lo/ta$a;->a:Lo/ta$a;

    iput-object v0, p0, Lo/ta;->e:Lo/ta$a;

    .line 78
    return-void
.end method

.method e(I)V
    .locals 0

    .line 53
    iput p1, p0, Lo/ta;->a:I

    .line 54
    return-void
.end method

.method e()Z
    .locals 2

    .line 69
    iget-object v0, p0, Lo/ta;->e:Lo/ta$a;

    sget-object v1, Lo/ta$a;->c:Lo/ta$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method i()V
    .locals 1

    .line 81
    sget-object v0, Lo/ta$a;->c:Lo/ta$a;

    iput-object v0, p0, Lo/ta;->e:Lo/ta$a;

    .line 82
    return-void
.end method
