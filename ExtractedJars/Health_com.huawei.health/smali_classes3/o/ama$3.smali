.class Lo/ama$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ama;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ama;

.field final synthetic b:Landroid/content/Context;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/ama;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/ama$3;->a:Lo/ama;

    iput-object p2, p0, Lo/ama$3;->b:Landroid/content/Context;

    iput-object p3, p0, Lo/ama$3;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 52
    iget-object v0, p0, Lo/ama$3;->a:Lo/ama;

    iget-object v1, p0, Lo/ama$3;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/ama$3;->d:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lo/ama;->d(Lo/ama;Landroid/content/Context;Z)V

    .line 53
    return-void
.end method
