.class Lnet/hockeyapp/android/UpdateActivity$2;
.super Ljava/lang/Object;
.source "UpdateActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/hockeyapp/android/UpdateActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/hockeyapp/android/UpdateActivity;

.field final synthetic val$updateActivity:Lnet/hockeyapp/android/UpdateActivity;


# direct methods
.method constructor <init>(Lnet/hockeyapp/android/UpdateActivity;Lnet/hockeyapp/android/UpdateActivity;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lnet/hockeyapp/android/UpdateActivity$2;->this$0:Lnet/hockeyapp/android/UpdateActivity;

    iput-object p2, p0, Lnet/hockeyapp/android/UpdateActivity$2;->val$updateActivity:Lnet/hockeyapp/android/UpdateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 174
    iget-object p1, p0, Lnet/hockeyapp/android/UpdateActivity$2;->val$updateActivity:Lnet/hockeyapp/android/UpdateActivity;

    invoke-virtual {p1}, Lnet/hockeyapp/android/UpdateActivity;->prepareDownload()V

    return-void
.end method
