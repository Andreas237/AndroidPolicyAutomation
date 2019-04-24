.class Lo/eie$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eie$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eie;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eie;


# direct methods
.method constructor <init>(Lo/eie;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lo/eie$4;->e:Lo/eie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Class;)Z
    .locals 7

    .line 168
    const-class v1, Lo/eld;

    :goto_0
    if-eqz v1, :cond_3

    .line 169
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    const/4 v0, 0x1

    return v0

    .line 172
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    .line 173
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 174
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    const/4 v0, 0x1

    return v0

    .line 173
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 168
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    .line 190
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public d()Lo/ejq;
    .locals 2

    .line 195
    new-instance v0, Lo/eld;

    iget-object v1, p0, Lo/eie$4;->e:Lo/eie;

    invoke-direct {v0, v1}, Lo/eld;-><init>(Lo/eie;)V

    return-object v0
.end method
