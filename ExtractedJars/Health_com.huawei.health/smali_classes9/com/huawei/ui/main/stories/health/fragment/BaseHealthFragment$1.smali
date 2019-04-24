.class Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$1;->b:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$1;->b:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 126
    return-void
.end method
