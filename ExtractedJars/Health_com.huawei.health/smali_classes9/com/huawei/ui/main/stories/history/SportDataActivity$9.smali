.class Lcom/huawei/ui/main/stories/history/SportDataActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportDataActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/history/SportDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V
    .locals 0

    .line 346
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$9;->e:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$9;->e:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->finish()V

    .line 350
    return-void
.end method
