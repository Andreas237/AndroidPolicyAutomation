.class Lo/fbf$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eie$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbf;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fbf;


# direct methods
.method constructor <init>(Lo/fbf;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lo/fbf$3;->c:Lo/fbf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Class;)Z
    .locals 7

    .line 71
    const-class v1, Lo/fbc;

    :goto_0
    if-eqz v1, :cond_3

    .line 72
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    const/4 v0, 0x1

    return v0

    .line 75
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    .line 76
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 77
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    .line 83
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public d()Lo/ejq;
    .locals 2

    .line 88
    new-instance v0, Lo/fbc;

    iget-object v1, p0, Lo/fbf$3;->c:Lo/fbf;

    invoke-direct {v0, v1}, Lo/fbc;-><init>(Lo/eie;)V

    return-object v0
.end method
