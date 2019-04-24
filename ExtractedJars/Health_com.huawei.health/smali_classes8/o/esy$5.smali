.class Lo/esy$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/pluginmessagecenter/service/MessageObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/esy;


# direct methods
.method constructor <init>(Lo/esy;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lo/esy$5;->a:Lo/esy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    .locals 4

    .line 115
    const-string v0, "UIHLH_NotificationInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MessageObserver onChange start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    iget-object v0, p0, Lo/esy$5;->a:Lo/esy;

    invoke-static {v0}, Lo/esy;->d(Lo/esy;)V

    .line 117
    return-void
.end method
