.class Lnet/hockeyapp/android/UpdateFragment$2;
.super Ljava/lang/Object;
.source "UpdateFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/hockeyapp/android/UpdateFragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/hockeyapp/android/UpdateFragment;

.field final synthetic val$updateFragment:Lnet/hockeyapp/android/UpdateFragment;


# direct methods
.method constructor <init>(Lnet/hockeyapp/android/UpdateFragment;Lnet/hockeyapp/android/UpdateFragment;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lnet/hockeyapp/android/UpdateFragment$2;->this$0:Lnet/hockeyapp/android/UpdateFragment;

    iput-object p2, p0, Lnet/hockeyapp/android/UpdateFragment$2;->val$updateFragment:Lnet/hockeyapp/android/UpdateFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 199
    iget-object p1, p0, Lnet/hockeyapp/android/UpdateFragment$2;->val$updateFragment:Lnet/hockeyapp/android/UpdateFragment;

    invoke-virtual {p1}, Lnet/hockeyapp/android/UpdateFragment;->prepareDownload()V

    return-void
.end method
