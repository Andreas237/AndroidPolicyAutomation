.class public final synthetic Lcom/ibotta/api/-$$Lambda$ApiModule$-oGYBX9LFd0SL3rRzuQOjW2MOGM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/api/ApiModule;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/api/ApiModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/-$$Lambda$ApiModule$-oGYBX9LFd0SL3rRzuQOjW2MOGM;->f$0:Lcom/ibotta/api/ApiModule;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/api/-$$Lambda$ApiModule$-oGYBX9LFd0SL3rRzuQOjW2MOGM;->f$0:Lcom/ibotta/api/ApiModule;

    invoke-static {v0}, Lcom/ibotta/api/ApiModule;->lambda$getHttpHeaders$0(Lcom/ibotta/api/ApiModule;)Lcom/ibotta/api/HttpHeaders;

    move-result-object v0

    return-object v0
.end method
