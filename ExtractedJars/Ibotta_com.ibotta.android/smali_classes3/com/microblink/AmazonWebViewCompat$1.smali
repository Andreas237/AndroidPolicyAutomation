.class Lcom/microblink/AmazonWebViewCompat$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/AmazonWebViewCompat;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonWebViewCompat;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonWebViewCompat$1;->this$0:Lcom/microblink/AmazonWebViewCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceiveValue(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/microblink/AmazonWebViewCompat$1;->onReceiveValue(Ljava/lang/Boolean;)V

    return-void
.end method
