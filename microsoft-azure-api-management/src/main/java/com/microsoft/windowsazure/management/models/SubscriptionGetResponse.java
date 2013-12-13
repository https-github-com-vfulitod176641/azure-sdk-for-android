// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.management.OperationResponse;

/**
* The Get Subscription operation response.
*/
public class SubscriptionGetResponse extends OperationResponse
{
    private String accountAdminLiveEmailId;
    
    /**
    * The live ID of the account administrator.
    */
    public String getAccountAdminLiveEmailId() { return this.accountAdminLiveEmailId; }
    
    /**
    * The live ID of the account administrator.
    */
    public void setAccountAdminLiveEmailId(String accountAdminLiveEmailId) { this.accountAdminLiveEmailId = accountAdminLiveEmailId; }
    
    private int currentCoreCount;
    
    /**
    * The number of currently allocated cores.
    */
    public int getCurrentCoreCount() { return this.currentCoreCount; }
    
    /**
    * The number of currently allocated cores.
    */
    public void setCurrentCoreCount(int currentCoreCount) { this.currentCoreCount = currentCoreCount; }
    
    private int currentDnsServers;
    
    /**
    * The current number of DNS servers allocated on this subscription.
    */
    public int getCurrentDnsServers() { return this.currentDnsServers; }
    
    /**
    * The current number of DNS servers allocated on this subscription.
    */
    public void setCurrentDnsServers(int currentDnsServers) { this.currentDnsServers = currentDnsServers; }
    
    private int currentHostedServices;
    
    /**
    * The number of currently allocated cloud services.
    */
    public int getCurrentHostedServices() { return this.currentHostedServices; }
    
    /**
    * The number of currently allocated cloud services.
    */
    public void setCurrentHostedServices(int currentHostedServices) { this.currentHostedServices = currentHostedServices; }
    
    private int currentLocalNetworkSites;
    
    /**
    * The current number of local virtual network sites that are allocated on
    * this subscription.
    */
    public int getCurrentLocalNetworkSites() { return this.currentLocalNetworkSites; }
    
    /**
    * The current number of local virtual network sites that are allocated on
    * this subscription.
    */
    public void setCurrentLocalNetworkSites(int currentLocalNetworkSites) { this.currentLocalNetworkSites = currentLocalNetworkSites; }
    
    private int currentStorageAccounts;
    
    /**
    * The number of currently allocated storage accounts.
    */
    public int getCurrentStorageAccounts() { return this.currentStorageAccounts; }
    
    /**
    * The number of currently allocated storage accounts.
    */
    public void setCurrentStorageAccounts(int currentStorageAccounts) { this.currentStorageAccounts = currentStorageAccounts; }
    
    private int currentVirtualNetworkSites;
    
    /**
    * The number of currently allocated virtual network sites.
    */
    public int getCurrentVirtualNetworkSites() { return this.currentVirtualNetworkSites; }
    
    /**
    * The number of currently allocated virtual network sites.
    */
    public void setCurrentVirtualNetworkSites(int currentVirtualNetworkSites) { this.currentVirtualNetworkSites = currentVirtualNetworkSites; }
    
    private int maximumCoreCount;
    
    /**
    * The maximum number of cores that can be allocated on this subscription.
    */
    public int getMaximumCoreCount() { return this.maximumCoreCount; }
    
    /**
    * The maximum number of cores that can be allocated on this subscription.
    */
    public void setMaximumCoreCount(int maximumCoreCount) { this.maximumCoreCount = maximumCoreCount; }
    
    private int maximumDnsServers;
    
    /**
    * The maximum number of DNS servers that can be allocated on this
    * subscription.
    */
    public int getMaximumDnsServers() { return this.maximumDnsServers; }
    
    /**
    * The maximum number of DNS servers that can be allocated on this
    * subscription.
    */
    public void setMaximumDnsServers(int maximumDnsServers) { this.maximumDnsServers = maximumDnsServers; }
    
    private int maximumHostedServices;
    
    /**
    * The maximum number of cloud services that can be allocated on this
    * subscription.
    */
    public int getMaximumHostedServices() { return this.maximumHostedServices; }
    
    /**
    * The maximum number of cloud services that can be allocated on this
    * subscription.
    */
    public void setMaximumHostedServices(int maximumHostedServices) { this.maximumHostedServices = maximumHostedServices; }
    
    private int maximumLocalNetworkSites;
    
    /**
    * The maximum number of local virtual network sites that can be allocated
    * on this subscription.
    */
    public int getMaximumLocalNetworkSites() { return this.maximumLocalNetworkSites; }
    
    /**
    * The maximum number of local virtual network sites that can be allocated
    * on this subscription.
    */
    public void setMaximumLocalNetworkSites(int maximumLocalNetworkSites) { this.maximumLocalNetworkSites = maximumLocalNetworkSites; }
    
    private int maximumStorageAccounts;
    
    /**
    * The maximum number of storage accounts that can be allocated on this
    * subscription.
    */
    public int getMaximumStorageAccounts() { return this.maximumStorageAccounts; }
    
    /**
    * The maximum number of storage accounts that can be allocated on this
    * subscription.
    */
    public void setMaximumStorageAccounts(int maximumStorageAccounts) { this.maximumStorageAccounts = maximumStorageAccounts; }
    
    private int maximumVirtualNetworkSites;
    
    /**
    * The maximum number of virtual network sites that can be allocated on this
    * subscription.
    */
    public int getMaximumVirtualNetworkSites() { return this.maximumVirtualNetworkSites; }
    
    /**
    * The maximum number of virtual network sites that can be allocated on this
    * subscription.
    */
    public void setMaximumVirtualNetworkSites(int maximumVirtualNetworkSites) { this.maximumVirtualNetworkSites = maximumVirtualNetworkSites; }
    
    private String serviceAdminLiveEmailId;
    
    /**
    * The live ID of the subscription administrator.
    */
    public String getServiceAdminLiveEmailId() { return this.serviceAdminLiveEmailId; }
    
    /**
    * The live ID of the subscription administrator.
    */
    public void setServiceAdminLiveEmailId(String serviceAdminLiveEmailId) { this.serviceAdminLiveEmailId = serviceAdminLiveEmailId; }
    
    private String subscriptionID;
    
    /**
    * The subscription ID that the operation was called on.
    */
    public String getSubscriptionID() { return this.subscriptionID; }
    
    /**
    * The subscription ID that the operation was called on.
    */
    public void setSubscriptionID(String subscriptionID) { this.subscriptionID = subscriptionID; }
    
    private String subscriptionName;
    
    /**
    * The user-supplied name of the subscription.
    */
    public String getSubscriptionName() { return this.subscriptionName; }
    
    /**
    * The user-supplied name of the subscription.
    */
    public void setSubscriptionName(String subscriptionName) { this.subscriptionName = subscriptionName; }
    
    private SubscriptionStatus subscriptionStatus;
    
    /**
    * The subscription status.
    */
    public SubscriptionStatus getSubscriptionStatus() { return this.subscriptionStatus; }
    
    /**
    * The subscription status.
    */
    public void setSubscriptionStatus(SubscriptionStatus subscriptionStatus) { this.subscriptionStatus = subscriptionStatus; }
    
    /**
    * Initializes a new instance of the SubscriptionGetResponse class.
    *
    */
    public SubscriptionGetResponse()
    {
    }
}