.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$Hye9Gsw_vyrz0CSfSWopNUq6uC8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/abstractions/SessionIdSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/session/SessionState;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/session/SessionState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$Hye9Gsw_vyrz0CSfSWopNUq6uC8;->f$0:Lcom/ibotta/android/state/session/SessionState;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$Hye9Gsw_vyrz0CSfSWopNUq6uC8;->f$0:Lcom/ibotta/android/state/session/SessionState;

    invoke-interface {v0}, Lcom/ibotta/android/state/session/SessionState;->getSessionId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
