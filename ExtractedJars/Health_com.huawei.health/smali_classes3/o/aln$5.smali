.class Lo/aln$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aln;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aln;


# direct methods
.method constructor <init>(Lo/aln;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/aln$5;->a:Lo/aln;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;)V
    .locals 3

    .line 133
    iget-object v0, p0, Lo/aln$5;->a:Lo/aln;

    invoke-static {v0}, Lo/aln;->c(Lo/aln;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    return-void

    .line 137
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;->getActivityRecognitionEvents()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    .line 139
    iget-object v0, p0, Lo/aln$5;->a:Lo/aln;

    invoke-static {v0, v2}, Lo/aln;->b(Lo/aln;Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;)V

    .line 140
    goto :goto_0

    .line 141
    :cond_1
    return-void
.end method

.method public a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;)V
    .locals 0

    .line 146
    return-void
.end method

.method public a(Lcom/huawei/android/location/activityrecognition/HwEnvironmentChangedEvent;)V
    .locals 0

    .line 151
    return-void
.end method
