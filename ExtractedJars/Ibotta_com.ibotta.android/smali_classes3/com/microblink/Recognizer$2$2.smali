.class Lcom/microblink/Recognizer$2$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/Recognizer$2;

.field final synthetic val$throwable:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lcom/microblink/Recognizer$2;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/Recognizer$2$2;->this$1:Lcom/microblink/Recognizer$2;

    iput-object p2, p0, Lcom/microblink/Recognizer$2$2;->val$throwable:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/Recognizer$2$2;->this$1:Lcom/microblink/Recognizer$2;

    iget-object v0, v0, Lcom/microblink/Recognizer$2;->val$callback:Lcom/microblink/RecognizerCallback;

    iget-object v1, p0, Lcom/microblink/Recognizer$2$2;->val$throwable:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    return-void
.end method
