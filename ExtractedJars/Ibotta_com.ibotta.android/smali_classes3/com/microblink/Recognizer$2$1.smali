.class Lcom/microblink/Recognizer$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/Recognizer$2;

.field final synthetic val$media:Lcom/microblink/Media;

.field final synthetic val$results:Lcom/microblink/ScanResults;


# direct methods
.method constructor <init>(Lcom/microblink/Recognizer$2;Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/Recognizer$2$1;->this$1:Lcom/microblink/Recognizer$2;

    iput-object p2, p0, Lcom/microblink/Recognizer$2$1;->val$results:Lcom/microblink/ScanResults;

    iput-object p3, p0, Lcom/microblink/Recognizer$2$1;->val$media:Lcom/microblink/Media;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/Recognizer$2$1;->this$1:Lcom/microblink/Recognizer$2;

    iget-object v0, v0, Lcom/microblink/Recognizer$2;->val$callback:Lcom/microblink/RecognizerCallback;

    iget-object v1, p0, Lcom/microblink/Recognizer$2$1;->val$results:Lcom/microblink/ScanResults;

    iget-object v2, p0, Lcom/microblink/Recognizer$2$1;->val$media:Lcom/microblink/Media;

    invoke-interface {v0, v1, v2}, Lcom/microblink/RecognizerCallback;->onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    return-void
.end method
