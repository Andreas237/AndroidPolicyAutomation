.class public Lo/eyl$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhuawei/widget/HwSubTabWidget$SubTabListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field private b:Z

.field final synthetic e:Lo/eyl;


# direct methods
.method public constructor <init>(Lo/eyl;)V
    .locals 1

    .line 130
    iput-object p1, p0, Lo/eyl$c;->e:Lo/eyl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyl$c;->b:Z

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyl$c;->b:Z

    .line 136
    return-void
.end method

.method public onSubTabReselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 141
    return-void
.end method

.method public onSubTabSelected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 2

    .line 145
    iget-boolean v0, p0, Lo/eyl$c;->b:Z

    if-nez v0, :cond_0

    .line 146
    return-void

    .line 148
    :cond_0
    instance-of v0, p1, Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_1

    .line 149
    move-object v1, p1

    .line 150
    iget-object v0, p0, Lo/eyl$c;->e:Lo/eyl;

    invoke-virtual {v0, v1}, Lo/eyl;->e(Lhuawei/widget/HwSubTabWidget$SubTab;)V

    .line 152
    :cond_1
    return-void
.end method

.method public onSubTabUnselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 157
    return-void
.end method
