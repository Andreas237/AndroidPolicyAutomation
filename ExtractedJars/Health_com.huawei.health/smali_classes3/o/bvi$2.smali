.class Lo/bvi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bvi;->d(Ljava/util/List;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bvi;

.field final synthetic c:Ljava/util/List;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bvi;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lo/bvi$2;->a:Lo/bvi;

    iput-object p2, p0, Lo/bvi$2;->c:Ljava/util/List;

    iput-object p3, p0, Lo/bvi$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 143
    iget-object v0, p0, Lo/bvi$2;->a:Lo/bvi;

    iget-object v1, p0, Lo/bvi$2;->c:Ljava/util/List;

    iget-object v2, p0, Lo/bvi$2;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/bvi;->b(Lo/bvi;Ljava/util/List;Ljava/lang/String;)V

    .line 144
    return-void
.end method
