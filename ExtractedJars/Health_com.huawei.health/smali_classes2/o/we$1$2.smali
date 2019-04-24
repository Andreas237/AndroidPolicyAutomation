.class Lo/we$1$2;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/we$1;->e(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic e:Lo/we$1;


# direct methods
.method constructor <init>(Lo/we$1;Lorg/json/JSONObject;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lo/we$1$2;->e:Lo/we$1;

    iput-object p2, p0, Lo/we$1$2;->a:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 169
    iget-object v0, p0, Lo/we$1$2;->e:Lo/we$1;

    iget-object v0, v0, Lo/we$1;->f:Lo/we;

    iget-object v1, p0, Lo/we$1$2;->e:Lo/we$1;

    iget-object v1, v1, Lo/we$1;->c:Landroid/content/Context;

    iget-object v2, p0, Lo/we$1$2;->e:Lo/we$1;

    iget-object v2, v2, Lo/we$1;->e:Ljava/lang/String;

    iget-object v3, p0, Lo/we$1$2;->a:Lorg/json/JSONObject;

    iget-object v4, p0, Lo/we$1$2;->e:Lo/we$1;

    iget-object v4, v4, Lo/we$1;->a:Ljava/util/Map;

    iget-object v5, p0, Lo/we$1$2;->e:Lo/we$1;

    iget-object v5, v5, Lo/we$1;->d:Lo/wo;

    iget-object v6, p0, Lo/we$1$2;->e:Lo/we$1;

    iget-object v6, v6, Lo/we$1;->b:Landroid/os/Bundle;

    iget-object v7, p0, Lo/we$1$2;->e:Lo/we$1;

    iget-object v7, v7, Lo/we$1;->h:Lorg/json/JSONObject;

    invoke-static/range {v0 .. v7}, Lo/we;->b(Lo/we;Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Lorg/json/JSONObject;)V

    .line 170
    return-void
.end method
