.class public interface abstract Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;
.super Ljava/lang/Object;
.source "IPanelStorageProviderCallback.java"


# static fields
.field public static final PANEL_STORAGE_PROVIDER_EMAIL_KEY:Ljava/lang/String; = "email_address"

.field public static final PANEL_STORAGE_PROVIDER_FIRST_NAME_KEY:Ljava/lang/String; = "first_name"


# virtual methods
.method public abstract getValueForKey(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract putValueForKey(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract removeValueForKey(Ljava/lang/String;)V
.end method
