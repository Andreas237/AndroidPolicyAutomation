.class final Lcom/microblink/Recognizer$ServiceHandler;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/Recognizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ServiceHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/Recognizer;


# direct methods
.method constructor <init>(Lcom/microblink/Recognizer;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/Recognizer$ServiceHandler;->this$0:Lcom/microblink/Recognizer;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method
