.class public Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;
.super Ljava/lang/Object;
.source "PasswordPrompterFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

.field private final passwordCache:Lcom/ibotta/android/security/PasswordCache;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/activity/CompatSupplier;Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    .line 22
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public create(Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompter;
    .locals 1

    const-string v0, "password_prompt"

    .line 27
    invoke-virtual {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;->create(Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompter;

    move-result-object p1

    return-object p1
.end method

.method public create(Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompter;
    .locals 9

    .line 32
    new-instance v8, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactoryImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    sget-object v4, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    move-object v0, v8

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;-><init>(Lcom/ibotta/android/activity/CompatSupplier;Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8
.end method
