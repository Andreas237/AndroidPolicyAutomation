.class Lcom/huawei/ui/main/stories/history/SportDataActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lo/eyc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/history/SportDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$5;->b:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/eic;)Z
    .locals 1

    .line 139
    invoke-virtual {p1}, Lo/eic;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    const/4 v0, 0x1

    return v0

    .line 142
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
