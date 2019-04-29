.class Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable$1;
.super Ljava/lang/Object;
.source "ThumbDrawable.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;


# direct methods
.method constructor <init>(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable$1;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 88
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable$1;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->access$002(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;Z)Z

    .line 89
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable$1;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->invalidateSelf()V

    .line 90
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable$1;->this$0:Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->access$102(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;Z)Z

    return-void
.end method
